package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import clases.Persona;

@ManagedBean
@RequestScoped
public class personaBean {

	private Persona persona=new Persona();
	private static List<Persona> lstPersona=new ArrayList();
	
	public personaBean(){
		
		
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public void registrar(){
		personaBean.lstPersona.add(this.persona);
		
	}
	public List<Persona> getLstPersona() {
		return lstPersona;
	}
	public void setLstPersona(List<Persona> lstPersona) {
		personaBean.lstPersona = lstPersona;
	}
	
	public void validar(FacesContext context, UIComponent toValidate, Object value){
		
		
	}
	
	
	public void eliminarPersona(Persona per){
		personaBean.lstPersona.remove(per);
		
	}
	
	
}
