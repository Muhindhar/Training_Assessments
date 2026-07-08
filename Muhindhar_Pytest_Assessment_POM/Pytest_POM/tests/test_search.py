import pytest
from actions.searchaction import SearchAction

@pytest.mark.smoke
@pytest.mark.usefixtures("setup_teardown")
class TestSearch:
    def test_search(self):
        search = SearchAction(self.driver, self.wait)
        search.search_product()
        assert search.check_product() == "Search - MacBook"