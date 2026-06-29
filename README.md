# Bus-Management-System

A Java console application that manages bus information using a custom-built Linked List
data structure. 

## Overview
The system simulates a university bus management service with two types of users: an
Administrator, who manages bus records and responds to student requests, and a User
(Student), who can search for buses, submit requests, and file complaints. All bus data,
requests, and complaints are persisted to text files ( Buses.txt , Requests.txt ,
Complaints.txt , Reports.txt ).


## Features
Administrator
- Add a new bus and its information (code, destination, other info)
- Delete a bus by its code
- View and update student requests
- Generate a report for a bus by code, destination, or other info
User (Student)
- Inquire about a specific bus by code
- Submit a request for a new bus destination
- Submit a complaint


## Project Structure
- (Bus) Stores bus data: code, destination, other info
  
- (Node) A single linked list node holding a Bus object

- (LinkedList) Custom linked list managing Node 'add, delete, display'

- (Administrator) Manages buses, requests, and reports via file I/O

- (User) Searches buses, submits requests and complaints

- (BusCs2) Main class with the menu-driven console interface


## How It Works
1. Administrator adds a bus → its info is appended to memory linked list.
Buses.txt and added to the in-
2. Administrator deletes a bus by code → the matching line is removed from Buses.txt.
3. User submits a request → it’s appended to Requests.txt along with their ID.
4. Administrator updates a request → the matching entry in Requests.txt gets a
response appended.
5. User searches a bus by code → the matching line from Buses.txt is returned.
6. User submits a complaint → it’s appended to Complaints.txt.
7. Administrator generates a report → matching bus records are written to Reports.txt.

