package roseindia.web.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.util.StringUtils;

import roseindia.dao.SpringHibernateDAO;
import roseindia.dao.hibernate.Product;
import roseindia.services.ServiceFinder;
import roseindia.web.struts.form.ProductForm;

public class ProductAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProductForm productForm = (ProductForm) form;
		if(productForm.getProduct() == null){
			Product p = new Product();
			p.setName(productForm.getName());
			p.setDescription(productForm.getDescription());
			productForm.setProduct(p);
		}
		
		 SpringHibernateDAO allcooljobsDAO = (SpringHibernateDAO) ServiceFinder.getContext(request)
	  		.getBean("SpringHibernateDao");
		 if(productForm.getActionType().equals("1")){
				allcooljobsDAO.saveProduct(productForm.getProduct());
		}if(productForm.getActionType().equals("2")){
				allcooljobsDAO.updateProduct(productForm.getProduct());
		}else if(productForm.getActionType().equals("3")){
			allcooljobsDAO.deleteProduct(productForm.getProduct());
		}
		productForm.setProducts(allcooljobsDAO.getAllProducts());
		if(productForm.getSource() != null && productForm.getSource().equals("FLEX"))
			return mapping.findForward("successFlex");
		else
			return mapping.findForward("success");
	}
	

}
