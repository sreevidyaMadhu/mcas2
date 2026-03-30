import pymongo
conn=pymongo.MongoClient("mongodb://localhost:27017")
db=conn["College"]
coll=db["studlist"]
print(db.list_collection_names())
# for i in coll.find({"gender":"female","course":"MCA"},{"name.fname":1,"name.lname":1,"mark":1,"_id":0}):
#     print(i) 
# for i in coll.find({"course":"MCA"}).sort({"mark":-1}).limit(1):    
#     print(i)
# for i in coll.find({"course":"Mechanical"}).sort({"mark":-1}).limit(3):    
#      print(i)
# for i in coll.find({"gender":"male","grade":"A+"}):
#      print(i) 
# for i in coll.find({"gender":"female","mark":{"$gt":90}},{"name.fname":1,"name.lname":1,"mark":1,"_id":0,"grade":1,"phone.no":1}):
#     print(i) 
# for i in coll.find({"mark":{"$gt":80,"$lt":90}}):
#     print(i) 
# for i in coll.find({"name.fname":{"$regex":"^V"}},{"name.fname":1,"name.lname":1}):
#      print(i) 
# for i in coll.find({"address.city":"Kollam"}):
#       print(i)
# for i in coll.find({"address.city":{"$nin":["Kollam","Thiruvananthapuram"]}}):
#        print(i)
for i in coll.find({"gender":"female","address.city":{"$in":["Kollam","Thiruvananthapuram"]}}):
       print(i)
 
