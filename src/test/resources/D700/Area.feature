Feature:Test select area function on global app

  /**
  * Created by poppy zhang on 2018/8/13.
  */

  @Area
  Scenario Outline: Test select area function on global app
    Given Set up testing environment on <Platform>
    When Choose <Country> as login country on <Platform>
    Examples:
      | Platform | Country |
      | android  | 美国      |
      | android  | 中国      |






