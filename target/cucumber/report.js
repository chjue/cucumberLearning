$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/firstTestFeaturs/baiduSearch.feature");
formatter.feature({
  "line": 1,
  "name": "test baidu serch",
  "description": "",
  "id": "test-baidu-serch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "search dog in baidu searchbox",
  "description": "",
  "id": "test-baidu-serch;search-dog-in-baidu-searchbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open baidu search page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I input \"dog\" in search box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "show search result should include \"dog\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BaiduSearch.iOpenBaiduSearchPage()"
});
formatter.result({
  "duration": 6013796032,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dog",
      "offset": 9
    }
  ],
  "location": "BaiduSearch.iInputInSearchBox(String)"
});
formatter.result({
  "duration": 128578416,
  "status": "passed"
});
formatter.match({
  "location": "BaiduSearch.iClickSearchButton()"
});
formatter.result({
  "duration": 79338959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dog",
      "offset": 35
    }
  ],
  "location": "BaiduSearch.showSearchResultShouldInclude(String)"
});
formatter.result({
  "duration": 6267819419,
  "status": "passed"
});
});