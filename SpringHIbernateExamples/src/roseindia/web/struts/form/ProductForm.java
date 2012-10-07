package roseindia.web.struts.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import roseindia.dao.hibernate.Product;

public class ProductForm extends ActionForm{
	private Product product;
	private List<Product> products;
	private String name;
	private String description;
	private String actionType;
	private String source;
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		if(getProduct() != null)
			getProduct().setName(name);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(getProduct() != null)
			getProduct().setDescription(description);
	}

	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}


	
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
