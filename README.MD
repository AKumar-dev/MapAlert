# MapAlert

An app that allows users to create geographically based incident requests, enabling them to accelerate government response to
problems within the city. 

### Vision: 
The original idea was to create an application that had two UIs, one for the average user and the other for city workers. Common
users would only be able to drop pins at their location detailing what type of issue was present, and city workers would have
administrator access (through a log-in form) that would allow them to retrieve cases, update the statuses, and finally resolve the
ticket. This would decrease the sense of disconnect people feel with the government, as they would have a direct link to
government departments along with more transparency. 

### Challenges: 
Android Studio environment and programming a live application was quite challenging as none of the team had coded in such a
style before. Connecting the back end to the front end also posed a challenge, as there were many ways we could approach the situation (all of which were new). Different strategies came up when deciding on implementation, such as using Angular/Ionic in order to make the app available on iOS, Android, and Web, and using Spring to create a restful API. Ultimately, we stuck with Android Studio due to it using Java, and Firebase because it seemed the least complicated.

### Implementation/End product: 
We used Android Studio to develop the interface, and Firebase to link the front/backend. 

![Firebase Database](https://i.imgur.com/QRUNj0U.png)

We decided to keep the app in a civilian
only scope, where the only possible action that can be taken is to report an issue. Instead of linking it for city workers, we decided
that they may already have services they use to keep track of events and issues, so access to just the Firebase database would most
likely be enough for them to optimize and implement it into their current procedures. 

![App Functionality Screenshots](https://i.imgur.com/w8rVs9L.jpg)

## Overall: 
While the app did not turn out 100% as was planned, this was a great learning experience as it exposed me to numerous technologies,
APIs, and frameworks, namely Node.js, Angular, Ionic, Spring (for RESTful API), and Firebase, all of which I never had exposure to
before the project. 

*Created @ HopHacks Fall 2018*
