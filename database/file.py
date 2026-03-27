import pymongo
conn=pymongo.MongoClient("mongodb://localhost:27017")
#print(conn.list_database_names())
db=conn["student"]
print(db.list_collection_names())
col=db["mark"]
data=[{"rollno":58,"name":"sreevidya","marks":100,"mark2":,"mark3":},
      {"rollno":14,"name":"akshay","marks":23},
      {"rollno":13,"name":"akhil","marks":52},
      {"rollno":53,"name":"parthiv","marks":59},
      {"rollno":42,"name":"merly","marks":22}]
#col.insert_many(data)
#for doc in col.find():
    #print(doc)
# print(col.find_one({"rollno":13},{"name"}))
#for i in col.find({},{"rollno","name"}).sort({"name":1}):
    #print(i)
for i in col.find({},{"rollno","name"}).sort({"name":1}):
    print(i)

