package roseindia.web.servlets;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import roseindia.dao.SpringHibernateDAO;
import roseindia.dao.hibernate.Product;
import roseindia.services.ServiceFinder;

public class ProductListServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SpringHibernateDAO allcooljobsDAO = (SpringHibernateDAO) ServiceFinder.getContext(request)
  		.getBean("SpringHibernateDao");
		response.setContentType("text/xml");
		List<Product> list = allcooljobsDAO.getAllProducts();
		/*XMLEncoder e = new XMLEncoder( new BufferedOutputStream( response.getOutputStream()));
		e.writeObject(list);*/
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("product", Product.class);
		String xml = "<?xml version='1.0'?>\n"+xstream.toXML(list);
		File f = new File("c:/temp/out.xml");
		if(!f.exists())
			f.createNewFile();
		new FileOutputStream(f).write(xml.getBytes());
		response.getWriter().write(xml);
	}

}
