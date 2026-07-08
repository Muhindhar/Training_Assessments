from actions.BaseAction import BaseAction
from pages.searchpage import SearchPage
class SearchAction(BaseAction):

    def __init__(self, driver, wait):
        super().__init__(driver, wait)
        self.sp = SearchPage()

    def search_product(self):
        self.sendkeys(self.sp.search, "MacBook")
        self.click(self.sp.sbtn)

    def check_product(self):
        return self.gettext(self.sp.check)