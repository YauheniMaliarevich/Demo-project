package controller.action;

public enum ActionEnum {
	REGISTRATION {
		{
		this.action = new RegistrationAction();
		}
	},
	LOGIN {
		{
		this.action = new LoginAction();
		}
	},
	GOTOREGISTRATIONPAGE {
		{
			this.action = new ForwardToRegistationPageAction();
		}
	},
	GOTOLOGINPAGE {
		{
		this.action = new ForwardToLoginPageAction();
		}
	},
	ADDCOMMENT {
		{
			this.action = new CommentAction();
		}
	};
	
	Action action;
	public Action getAction() {
		return action;
	}

}
