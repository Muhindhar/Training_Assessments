from actions.BaseAction import BaseAction
from pages.registerpage import Registerpage


class RegisterAction(BaseAction):
    def __init__(self, driver, wait):
        super().__init__(driver, wait)
        self.rp = Registerpage()
    def clk_reg(self):
        self.click(self.rp.myacc)
        self.click(self.rp.reg)
    def enter_det(self):
        self.sendkeys(self.rp.fname, "Muhindhar")
        self.sendkeys(self.rp.lname, "SV")
        self.sendkeys(self.rp.email, "muhidemo@gmail.com")
        self.sendkeys(self.rp.tel, "9090909090")
        self.sendkeys(self.rp.pass1, "1234567890")
        self.sendkeys(self.rp.passc, "1234567890")
    def clk_contbtn(self):
        self.click(self.rp.pp)
        self.click(self.rp.contbtn)
    def checklogin(self):
        return self.gettext(self.rp.check)
