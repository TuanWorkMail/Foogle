##### What?
- Java app that read JSON/CSV file and spit out Solr's XML
- Java app that call the above that auto scan for new file in folder
- Spring MVC app that call the above app or Solr to search
- Angular app that can search, see detail and charting

##### What is the easiest?
- read a file, parse it then create xml object
- create xml file in Solr format
- get list of files from folder
- watch the folder for changes
- read list of folders from json file
_______________________________________________

##### To dos:
- A public api or a data source to feed to Solr
- Similar stack: Solr -> Spring -> Angular
- Very simple to be fast
- TDD
- Using github or gerrit
- First prototype very quickly using TypeScript and Node
- Using Jenkins/TravisCI and SonarQube

##### High level:
- Crawler:
    - A simple java app that take in 1 argument: a json file and output to ./Index a xml file in Solr format
- Crawler service:
	- A java app that wrap Crawler and facilitate connection with server through socket
- Server:
	- A simple Spring REST API app that take call from UI and communicate with Solr or Crawler Service through socket
- UI:
	- Angular app  
	- Chartist, dychart ,D3
	
##### Priority:
- Server
- UI
- Crawler Service
- Crawler

##### Main functions:
- Indexing files
- Searching indexed files
- Showing details 
- Charting

##### Plan:
- TDD
- Create a barebone API and UI
	
##### Prototype:
- Server
    - a simple test file that dump JSON from memory as DB
    - Search API + Test

##### what to do:
- Crawler Service Java 8 Core:
    - read a file with zipped csv file of weather/stock data
    - send to a Spring app