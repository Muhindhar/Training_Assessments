import pytest
from actions.loginAction import LoginAction

@pytest.mark.regression
@pytest.mark.usefixtures("setup_teardown")
class TestLogin:
    @pytest.mark.parametrize(
        "email,password,expected",[("muhidemo@gmail.com", "1234567890", "success"),
            ("abc", "123456", "warning"),
            ("muhidemo@gmail.com", "wrongpass", "warning"),
        ],
    )
    def test_login(self, email, password, expected):
        login = LoginAction(self.driver, self.wait)
        login.open_login()
        login.login_user(email, password)
        if expected == "success":
            assert login.checklogin() == "My Account"
        else:
            assert "Warning" in login.warn()
