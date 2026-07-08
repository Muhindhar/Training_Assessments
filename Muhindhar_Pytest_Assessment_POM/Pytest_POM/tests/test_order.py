import pytest
from actions.cartaction import CartAction

@pytest.mark.regression
@pytest.mark.usefixtures("setup_teardown")
class TestCart:

    def test_add_to_cart(self):
        cart = CartAction(self.driver,self.wait)
        cart.search_product()
        cart.open_product()
        cart.add_to_cart()
        