# RailConnect Help

## Back-End Changes

### Tickets
- Create a Tickets POJO with the following attributes:
    - pnrNo (primary key, autogenerated)
    - Bookings status
    - Other relevant attributes as per the ER diagram
- Utilize the ER diagram to define relationships with other entities.

## User

### Users
- **Front-End Changes (rohit)**
    - Edit MyBookings component. Add Upcoming (booked+waiting) and Previous (cancelled+trainDeparture) bookings. If possible, add an All column.
    - Add a delete profile button below the edit button in UserProfile component.

- **Back-End Changes (Jayesh)**
    - [X] Create Users table with fields given in ER diagram.
    - Implement User Controller API.
    - Implement Trigger: If a user deletes their account, set the user status to inactive. Also, while logging in, check the user status before further verifications.
    - Create a User Feedback table (Entity) having columns (Fid, UserId, Feedback (string)).

### Trains
- **Front-End Changes**
    - Implement train info page, which is called when the user clicks on the Train schedule link in TrainList component. This train info page should look something like a route *(src_name)------->-----*(intermediate_name)----->-------*(des_name). Animations, images, videos, etc., can be added to fill up the page (least priority).
    - Add input tag in AddTrain page for columns missing in entities (ex date) (Meet).
    
- **Back-End Changes (Meet)**
    - [X] Implement train pojo with ER diagram fields also Date column. Add the relationships.
    - Implement Controllers for train API.
    - Implement Triggers: cancel train (train should be rescheduled to some particular date) and also after journey completion, the train should be scheduled according to respective dates.
    - [X] Make a Route table having columns (id, source, intermediate, destination). Also, make class table according to ER diagram and implement relationships.

### Admin
- **Front-End Changes (Rohit)**
    - Replace headings in the header component when admin logs in and set it as - Trains (Home), Users (ContactUs), Payments (AboutUs), and FeedBack (FAQS). Implement the feedback page.

- **Back-End Changes**
    - [X] Create a pojo with the given Fields in ER and relationships.

### Bookings
- **Front-End Changes (Yash)**
    - Just implement the changes to my bookings written in Users - frontend.

- **Back-End Changes (Yash)**
    - Research something about the payment gateway and success and failure calculation.
    - ChatGPT: if a user clicks on make payment then the seat should be decremented but if the transaction fails or the user doesn't make payment in 5 mins then it should go back and increment the seats using a trigger in the railway reservation system. But, if the payment is successful that trigger should not fire of incrementing the seats. How to implement this in spring boot backend and react frontend
    - Add Controllers

### Tickets
- **Back-End Changes**
    - [X] Create tickets pojo with pnrNo (primaryKey-autogenerated), Bookings status, etc., use ER diagram to show all the relationships.

