package com.reporting.mbeans;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.primefaces.component.accordionpanel.AccordionPanel;

@ManagedBean
@SessionScoped
public class TabMenuNavigationBean implements Serializable {

	
	
	private Long activeIndex;
	
	

	public Long getActiveIndex() {
		return activeIndex;
	}

	public void setActiveIndex(Long activeIndex) {
		this.activeIndex = activeIndex;
	}
	
	@PostConstruct
	public void init(){
		activeIndex=(long) 0;
	}
 private boolean pan_admin= false;
 private boolean pan_reporting = false;
 private boolean pan_postpaye= false;
 private boolean pan_interco=false;
 
 public boolean isPan_postpaye() {
	return pan_postpaye;
}
 public void setPan_postpaye(boolean pan_postpaye) {
	this.pan_postpaye = pan_postpaye;
}
 
 public boolean isPan_admin() {
	return pan_admin;
}
 public boolean isPan_reporting() {
	return pan_reporting;
}
 public void setPan_admin(boolean pan_admin) {
	this.pan_admin = pan_admin;
}
 public void setPan_reporting(boolean pan_reporting) {
	this.pan_reporting = pan_reporting;
}
	private boolean pan_prepay� = false;
	
	public boolean isPan_prepay�() {
		return pan_prepay�;
	}
	public void setPan_prepay�(boolean pan_prepay�) {
		this.pan_prepay� = pan_prepay�;
	}
	public boolean isPan_interco() {
		return pan_interco;
	}
	public void setPan_interco(boolean pan_interco) {
		this.pan_interco = pan_interco;
	}
	
	public void changeActiveIndex(Long x){
		activeIndex=x;
		if(x==0){
			pan_prepay�=false;
			pan_reporting=false;
			pan_postpaye=false;
			pan_admin=true;
			pan_interco=false;
			
		}
if(x==1){
	pan_prepay�=true;
			pan_admin=false;
			pan_reporting=false;
			pan_postpaye=false;
			pan_interco=false;
		}
		if(x==2){
			pan_prepay�=false;
			pan_admin=false;
			pan_postpaye=false;
			pan_reporting=true;
			pan_interco=false;
		}
		if(x==3){
			pan_prepay�=false;
			pan_admin=false;
			pan_reporting=false;
			pan_postpaye=true;
			pan_interco=false;
		}
		if(x==4){
			pan_prepay�=false;
			pan_admin=false;
			pan_reporting=false;
			pan_postpaye=false;
			pan_interco=true;
		}
		
		
		
				
			
			
		
	}
	
	
}
