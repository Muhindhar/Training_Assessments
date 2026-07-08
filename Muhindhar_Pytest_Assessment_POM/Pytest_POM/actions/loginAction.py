from actions.BaseAction import BaseAction
from pages.loginpage import LoginPage
class LoginAction(BaseAction):

    def __init__(self, driver, wait):
        super().__init__(driver, wait)
        self.lp = LoginPage()

    def open_login(self):
        self.click(self.lp.myacc)
        self.click(self.lp.login)

    def login_user(self, email, password):
        self.sendkeys(self.lp.email, email)
        self.sendkeys(self.lp.passw, password)
        self.click(self.lp.contn)

    def warn(self):
        return self.gettext(self.lp.warn)