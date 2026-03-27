import pymongo
conn=pymongo.MongoClient("mongodb://localhost:27017")
db=conn["student"]
col1=db["exam"]
print(db.list_collection_names())
data=[{"rollno":58,"name":"sreevidya","mark1":20,"mark2":56,"mark3":30},
      {"rollno":14,"name":"akshay","mark1":10,"mark2":29,"mark3":40},
      {"rollno":13,"name":"akhil","mark1":60,"mark2":58,"mark3":50},
      {"rollno":53,"name":"parthiv","mark1":100,"mark2":79,"mark3":50},
      {"rollno":42,"name":"merly","mark1":100,"mark2":20,"mark3":80}]
# col1.insert_many(data)
# for i in col1.find():
#     total=i["mark1"]+i["mark2"]+i["mark3"]
#     print(i["name"],"marks:",total)
# for i in col1.find(["name":{"$regex":"^a"}]):
#     print(i)
print(col1.find({"name": {"$regex": "v$"}}))   

# for i in col1.find({},{"rollno","name"}).sort({"name":1}):
#     print(i)
# qry={"rollno":58}
# new={"$set":{"mark2":100}}
# col1.update_one(qry,new)
# print(col1.find_one({"rollno":58}))

