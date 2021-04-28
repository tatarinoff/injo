# injo
InnerJoin Example

You need to write a console application that makes an _InnerJoin_ analog for the 2 csv files.
At startup, application reads the contents of the files merged by id fields
and displays on the screen name and surname of employee and department where the person works.

####Employee table
| id | name    | surname | department_id |
|----|---------|---------|---------------|
| 1  | John    | Smith   | 2             |
| 2  | Pete    | Hallock | 1             |
| 3  | Freddie | Ruckman | ""            |
| 4  | Lee     | Alen    | 4             |
| 5  | Paul    | Miller  | 3             |
| 6  | David   | King    | 4             |
| 7  | Nicol   | Green   | 2             |
| 8  | Nicol   | Green   | 6             |

####Department table
| id | name       |
|----|------------|
| 1  | Marketing  |
| 2  | Management |
| 3  | Finance    |
| 4  | Production |