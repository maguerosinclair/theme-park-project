theme-park-project
==================

You have been hired by a large corporation to improve their theme park.  They have $$$, and they are interested in making more.  They have read [this article]:http://nerdguru.wordpress.com/2007/11/26/examining-theme-park-throughput/, and determined that they need to help riders get on more rides.

I've begun writing a simulator to test my new ideas.  It has may have bugs, it only has a certain number of parameters, and it has lots of features that could be added.  

Here's where you come in.

You are going to help me prototype some possible wait management solutions.  

Steps to accomplish
-------------------

1.  Fork the repo with your group.
2.  Clone to your machine, then read and test my code.  
3.  Do you have questions?  Ask a peer if you have questions, or post questions in issues in THIS repo.
4.  Is this a a good simulation?  Are there parameters missing?   log enhancements in issues.
5.  Are there bugs or things that don't work? Log bugs in issues.
6.  Pick an issue to fix, do it, and make a pull request.
7.  Consider a wait management product.  Do some research online.  
8.  In YOUR forked repo, start some issues that your team is going to solve.
9.  Implement the solution.
10.  Make a pull request for the solution.

Your grade for the group will be the step you reach.

local setup instructions
------------------------
clone the repo to your computer, then compile and run the Park class

`git clone git@github.com:[USER]/theme-park-project.git`
`cd theme-park-project`
`javac -cp jcommon-1.0.20.jar:jfreechart-1.0.16.jar *.java`
`java -cp jcommon-1.0.20.jar:jfreechart-1.0.16.jar:. Park`

