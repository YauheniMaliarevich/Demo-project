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
	};
	Action action;
	public Action getAction() {
		return action;
	}

}
