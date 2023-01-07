Feature: IKEA Test project


  @Regression @Smoke
  Scenario:
    Given Navigate to ikea.com.tr
    And the table is typed into the search box.
      | search | çalışma masası |

    And the second option is added to the cart.
      | addtable |

    And Go to cart.
      | close         |
      | gotocart      |
      | cart          |
      | withoutmember |

    And Add to Adress
      | adresekleme |

    And Address Info
      | mail    | example99@gmail.com |
      | name    | White               |
      | surname | Dark                |
      | mobile  | 5464512654          |

    And AdressAddValue
      | il      | Ankara        |
      | ilce    | Evren         |
      | mahalle | Esentepe mah. |

    And Address Info
      | adres | examplaename |
      | tc    | 26537364091  |

    And Add to Adress
      | addadress |

    And the table is typed into the search box.
      | search | banyo havlusu |

    And the second option is added to the cart.
      | havlu |

    And Go to cart.
      | close         |
      | gotocart      |
      | cart          |
      | withoutmember |

    And The table item in the basket is removed.
      | remove |
      | remove |

    Then Your Shopping Cart is currently empty.
      | check |
