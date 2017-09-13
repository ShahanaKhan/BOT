package demo.web.controller;

public class WebhookResponse {

	private String speech;
	private String text;

	public String getSpeech() {
		return speech;
	}

	public String getText() {
		return text;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	public void setText(String text) {
		this.text = text;
	}

	public WebhookResponse(String speech, String text) {
		super();
		this.speech = speech;
		this.text = text;
	}
}
