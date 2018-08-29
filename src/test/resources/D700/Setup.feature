Feature:Setup running environment on android or ios

  /**
  * Created by poppy zhang on 2018/8/10.
  */

  @Setup
  Scenario Outline: Setup running environment on android or ios
    Given Set up testing environment on <Platform>
    Examples:
      | Platform |
      | android  |
#      | ios      |






