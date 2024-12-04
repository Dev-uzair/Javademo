```toml
name = 'create a user'
description = 'with user request body'
method = 'POST'
url = 'http://localhost:8080/user/'
sortWeight = 1000000
id = '51b6bcb3-d014-4278-8d25-b43badf282f8'

[body]
type = 'JSON'
raw = '''
{
  "userName": "zaid",
  "email": "email",
  "phoneNumber": "93848423942"
}'''
```
