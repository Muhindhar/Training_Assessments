import pytest
from actions.registeraction import RegisterAction

@pytest.mark.smoke
@pytest.mark.usefixtures("setup_teardown")
class TestRegister:
    def test_registration(self):
        reg = RegisterAction(self.driver, self.wait)
        reg.clk_reg()
        reg.enter_det()
        reg.clk_contbtn()
        assert reg.checklogin() == "Your Account Has Been Created!"