package com.mantledillusion.vaadin.cotton.demo.view;

import com.mantledillusion.vaadin.cotton.viewpresenter.Addressed;
import com.mantledillusion.vaadin.cotton.viewpresenter.Presented;
import com.mantledillusion.vaadin.cotton.viewpresenter.Addressed.Redirect;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;

@Addressed(value="CottonDemo/Home", redirects={@Redirect("")})
@Presented(HomePresenter.class)
public class HomeView extends AbstractUserView {
	
	private static final long serialVersionUID = 1L;
	
	static final String BTN_COMPONENT_ID = "btn";

	@Override
	protected Component buildContent(TemporalActiveComponentRegistry reg) throws Throwable {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setSizeFull();
		
		Button b = new Button("Navigate to restricted access");
		reg.registerActiveComponent(BTN_COMPONENT_ID, b);
		layout.addComponent(b);
		layout.setComponentAlignment(b, Alignment.MIDDLE_CENTER);
		
		return layout;
	}
}
