package roseindia.web.struts.action;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import roseindia.dao.SpringHibernateDAO;
import roseindia.dao.hibernate.Product;
import roseindia.services.ServiceFinder;

public class ProductsListAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		 
		return null;
	}

}
