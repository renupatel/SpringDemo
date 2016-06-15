package beans;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class FormBackup extends ActionForm {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		if(name.equals("")){
			
		}
		return super.validate(mapping, request);
	}
	@Override
	public ActionErrors validate(ActionMapping arg0, ServletRequest arg1) {
		
		ActionErrors ae = new ActionErrors();
		if(name.equals("")){
			ae.add("name", new ActionMessage("msg"));
			return ae;
		}
		return super.validate(arg0, arg1);
	}
	
}
