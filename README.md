# cucumber-java
[Cucumber](https://cucumber.io/) is a software tool that supports behavior-driven development (BDD). </br>
[Java](https://www.java.com/en/) is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

## Core Concepts
* [Behaviour Driven Development](https://en.wikipedia.org/wiki/Behavior-driven_development) is an agile software development process that encourages collaboration among developers, quality assurance testers, and customer representatives in a software project.
    * Stakeholders might be used to the User Story template; ["As a … I want … So that …"](https://martinfowler.com/bliki/UserStory.html)
    * Developers might be used to a unit test design pattern; ["Arrange, Act, Assert"](http://wiki.c2.com/?ArrangeActAssert)
    * Cucumber expresess functionality using keywords; ["Given, When, Then"](https://en.wikipedia.org/wiki/Given-When-Then)
* [Fluent Interface](https://en.wikipedia.org/wiki/Fluent_interface) is an object-oriented API whose design relies extensively on method chaining.
    * PageObect.someFunction()
    * PageOject.someElement().click()
* [Page Object Model](https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/) is a Design Pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication. </br>
    * The "login" screen will have a "Login page object" that contains the selectors for elements on the page and functions that can be performed on that page.

## Getting Started
1. Install [NodeJS](https://nodejs.org/en/) LTS
1. [Android] Install [Android Studio](https://developer.android.com/studio) and [create an AVD](https://developer.android.com/studio/run/managing-avds)
1. Clone this repo
1. Open [`cucumber-java`](/) using [IntelliJ IDEA](https://www.jetbrains.com/idea/)
1. Select "Terminal" from the bottom toolbar
1. Run `npm i appium`
1. In the "Project" pane, right-click `pom.xml` and then select "Maven > Reload Project" to install dependencies
1. In the "Project" pane, right-click `SeleniumWebdriver` create a new file called `.env`
1. Copy+Paste the following
   ```
   TEST_BASE_URL=https://the-internet.herokuapp.com
   TEST_USER=tomsmith
   TEST_PASS=SuperSecretPassword!
   ```
1. Save

## Run Tests

### AltUnity (Unity Mobile Apps)
[AltUnity](https://altom.gitlab.io/altunity/altunitytester) enables UI test automation, by instrumenting games to get access and programmatically control the Unity objects.</br>
The [apk](/trashcat.apk) is included as part of _this_ sample repo.

With the [AVD](https://developer.android.com/studio/run/emulator-commandline) running:

1. Open the project using [IntelliJ IDEA](https://www.jetbrains.com/idea/)
1. In the "Project" pane, select the feature(s)
1. Right-click and then select "⏵(Run)"

### Appium (Web Apps)
[Appium](https://appium.io) is an open source automation tool for running scripts and testing native applications, mobile-web applications and hybrid applications on Android or iOS using a webdriver. </br>
Example tests use https://developer.android.com/training/basics/firstapp </br>
The [apk](/app-debug.apk) is included as part of _this_ sample repo.

With the [AVD](https://developer.android.com/studio/run/emulator-commandline) running:

1. Open the project using [IntelliJ IDEA](https://www.jetbrains.com/idea/)
1. In the "Project" pane, select the feature(s)
1. Right-click and then select "⏵(Run)"

### Selenium (Web Apps)
[Selenium](https://selenium.dev) is an open-source automated testing framework for web applications. </br>
Example tests use https://the-internet.herokuapp.com/login

1. Open the project using [IntelliJ IDEA](https://www.jetbrains.com/idea/)
1. In the "Project" pane, select the feature(s)
1. Right-click and then select "⏵(Run)"
