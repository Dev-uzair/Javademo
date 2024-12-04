```toml
name = 'create Post'
method = 'POST'
url = 'http://localhost:8080/post/'
sortWeight = 1000000
id = '78257b79-04e9-4e0a-8c8a-0db307555b8c'

[body]
type = 'JSON'
raw = '''
{
  "title": "first post",
  "userId": 3
}'''
```
