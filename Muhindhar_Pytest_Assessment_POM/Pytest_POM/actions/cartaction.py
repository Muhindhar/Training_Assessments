from actions.BaseAction import BaseAction
from pages.orderpage import orderpage

class CartAction(BaseAction):

    def __init__(self,driver,wait):
        super().__init__(driver,wait)
        self.cp = orderpage()
    def search_product(self):
        self.sendkeys(self.cp.search,"MacBook")
        self.click(self.cp.sbtn)
    def open_product(self):
        self.click(self.cp.macbook)
    def add_to_cart(self):
        self.click(self.cp.addcart)
    def get_cart_details(self):
        return self.gettext(self.cp.cart)