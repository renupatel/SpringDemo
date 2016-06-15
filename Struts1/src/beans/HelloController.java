package beans;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloController extends Action {

	@Override
	public ActionForward execute(ActionMapping arg0, ActionForm arg1, ServletRequest arg2, ServletResponse arg3)
			throws Exception {
		
		String name = arg2.getParameter("name");
		
		arg2.setAttribute("name", name);
		arg0.findForward("success");
	
		return super.execute(arg0, arg1, arg2, arg3);
	} 
}
