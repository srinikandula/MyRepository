package roseindia;

import java.util.ArrayList;

import javax.faces.model.SelectItem;

public class JSFBean {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	private String selectedItem;
	private ArrayList<SelectItem> items = null;
	public String getSelectedItem() {
	    this.selectedItem = "--Select--";
	    return selectedItem;
	}
	public void setSelectedItem(String selectedItem) {      
	    this.selectedItem = selectedItem;
	}
	public ArrayList<SelectItem> getItems() {
	    this.items = new ArrayList<SelectItem>();
	    SelectItem selectItem = new SelectItem("1","1");
	    SelectItem selectItem1 = new SelectItem("--Select--","--Select--");
	    this.items.add(selectItem);
	    this.items.add(selectItem1);
	    return items;
	}
	public void setItems(ArrayList<SelectItem> items) {
	    this.items = items;
	}
	public String submit(){
		return "good";
	}

}
