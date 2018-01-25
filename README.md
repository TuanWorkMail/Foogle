To dos:
	- A public api or a data source to feed to Solr
	- Similar stack: Solr -> Spring -> Angular
	- Very simple to be fast
	- TDD
	- Using github or gerrit

High level:
	Crawler:
		○ A simple java app that take in 1 argument: a json file and output to ./Index a xml file in Solr format
	Crawler service:
		○ A java app that wrap Crawler and facilitate connection with server through socket
	Server:
		○ A simple Spring REST API app that take call from UI and communicate with Solr or Crawler Service through socket
	UI:
		○ Angular app  
		○ Chartist, dychart ,D3
	
Priority:
	- Server
	- UI
	- Crawler Service
	- Crawler

Main functions:
	- Indexing files
	- Searching indexed files
	- Showing details 
	- Charting

Plan:
	- TDD
	- Create a barebone API and UI
	
