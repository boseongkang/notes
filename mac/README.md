<h2> App store Xcode update infinite loading

<h3> Check status 

- cmd + space -> console
- search 'appstore' at the top right side
- click 'start' 
- Fraction completed: 0.~ shows the percentage

<h3> Terminal solution

- open terminal
- type `pkill -9 -f appstoreagent`
- close the app store
- reopen
- update
