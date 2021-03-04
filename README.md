# Asm
this is a middleware using for my asm.  
algorithm :
I have designed an algorithm to solve the problem. The first input is a string no longer than 250 characters. From this input when the condition is met, the string will be put into the queue for storage (enqueue ()). It is further pushed out of the queue and placed on a stack to store data and display it on the screen.
Since it is middleware, it is possible to have multiple messages sent at the same time. Therefore, having a user queue is important. This queue will be a buffer, used to organize messages to avoid congestion and errors.
The role of the stack is also very important. A stack will be used for processing. This ensures messages are cached after they are released from the queue (dequeue ()) and placed on the stack for storage (push ()). The application has the feature of the back-in-front stack that it is able to store messages accordingly
