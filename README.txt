Person Reward Management Release Notes

Release 1.0.0
Last revised July 15, 2017

----------------

CONTENTS OF THIS FILE
---------------------

 * Introduction
 * Features
 * Implementation
 * Integration (with other modules)
 * Installation and configuration
 * SAMPLE JSONS


INTRODUCTION
------------

Person Reward Management App will take a list of vouchers and credits from other 2 web services which is a micro services and deployed in different ports.
It will show the output in JSON format which contains nothing but a person-wise aggregate of the vouchers and credits awarded to them.

FEATURES
--------

First, a voucher service which is responsible for returning all the vouchers which runs in port 8082.
Secondly, a credit service which is responsible for returning all the credits which runs in port 8083.

Finally reward management calls both the service via REST and gets all the credits and vouchers and shows the result as a JSON according to the firstName and lastName of a person.

IMPLEMENTATION
--------------

Basically, Voucher service creates a List of Voucher which is having voucher-number,voucher-value,currency,firstname,lastname.
And Credit service creates a List of Credit which is having credit-id,points,firstname,lastname.
And Reward Management creates a List of reward which is having list of voucher, list of credit,firstname,lastname.

INTEGRATION (WITH OTHER MODULES)
--------------------------------
Reward Management makes 2 rest calls which gets the value of voucher and credits and process accordingly.


INSTALLATION AND CONFIGURATION
------------------------------

0 - Prerequisites:
Should have eclipse and Gradle installed.

1 - Download the projects and copy it into your any local folder:

2 - Configuration:
Import mentioned 3 projects (voucher-service, credit-service, reward) into workspace.

Refresh all 3 Gradle projects into workspace so all the gradle dependencies will get downloaded into local repository.

All the 3 projects is a spring boot projects so directly can be started.

2.1. Run as - java application CreditMgmtApp
2.2. Run as - java application VoucherMgmtApp
2.3. Run as - java application RewardMgmtApp

After successful running all the spring boot applications, go to the browser and hit the url localhost:8080/rewards

It will display the json of all the credits and vouchers of a person specific.

SAMPLE JSONS
------------

"voucher" : [ { "voucher-number":"V2378578346", "voucher-value":1200, "currency": "INR", "firstname": "Drew", "lastname": "Barrymore", }, { "voucher-number":"V183240062", "voucher-value":5, "currency": "USD", "firstname": "Johnny", "lastname": "Depp", }, { "voucher-number":"V45708293", "voucher-value":500, "currency": "INR", "firstname": "Drew", "lastname": "Barrymore", }, { "voucher-number":"V1106", "voucher-value":60, "currency": "INR","firstname": "Brad", "lastname": "Pitt", }, ]
"credit" : [ { "credit-id":"C072341", "points":100, "firstname": "Drew", "lastname": "Barrymore" }, { "credit-id":"C3475634", "points":50, "firstname": "Johnny", "lastname": "Depp" }, { "credit-id":"C34857", "points":10, "firstname": "Drew", "lastname": "Barrymore" } ]
"reward" : [ { "credit" : ["C072341","C34857"], "voucher" : ["V2378578346", "V45708293"], "firstname" : "Drew", "lastname" : "Barrymore" }, { "credit" : ["C3475634"], "voucher" : ["V183240062"], "firstname": "Johnny", "lastname": "Depp" }, { "credit" : [], "voucher" : ["V1106"], "firstname": "Brad", "lastname": "Pitt" } ]

