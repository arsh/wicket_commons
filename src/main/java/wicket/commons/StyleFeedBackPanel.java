package wicket.commons;

import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

/**
 * This feedback panel updates the class attribute to highlight errors.
 * 
 * @author andres santana
 * 
 */
@SuppressWarnings("serial")
public class StyleFeedBackPanel extends FeedbackPanel {

	private String infoClass;
	private String errorClass;

	public static final String DEFAULT_INFO_CLASS = "info";
	public static final String DEFAULT_ERROR_CLASS = "error";

	/**
	 * Creates a style feedback panel to show/report errors / info to users.
	 * 
	 * @param id
	 *            is the Panel identifier.
	 * @param infoClass
	 *            is the CSS class for info messages
	 * @param errorClass
	 *            is the CSS class for error messages
	 */
	public StyleFeedBackPanel(String id, String infoClass, String errorClass) {
		super(id);
		setOutputMarkupId(true);
		this.infoClass = infoClass;
		this.errorClass = errorClass;
	}

	/**
	 * Creates a style feedback panel with default classes.
	 * 
	 * @see StyleFeedBackPanel#DEFAULT_INFO_CLASS
	 * @see StyleFeedBackPanel#DEFAULT_ERROR_CLASS
	 * @param id
	 */
	public StyleFeedBackPanel(String id) {
		super(id);
		setOutputMarkupId(true);
		this.infoClass = DEFAULT_INFO_CLASS;
		this.errorClass = DEFAULT_ERROR_CLASS;
	}

	public String getInfoClass() {
		return infoClass;
	}

	public void setInfoClass(String infoClass) {
		this.infoClass = infoClass;
	}

	public String getErrorClass() {
		return errorClass;
	}

	public void setErrorClass(String errorClass) {
		this.errorClass = errorClass;
	}

	@Override
	protected String getCSSClass(FeedbackMessage message) {
		if (message.isError()) {
			return getErrorClass();
		}
		return getInfoClass();
	}

}
