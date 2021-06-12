printjson(db.people.insertOne(
    { "sex":"Male","first_name":"Bartosz","last_name":"Kowalski","job":"Programmer","email":"kalarepa.rules@mail.com","location":{"city":"Warsaw","address":{"streetname":"Piszczałkowa","streetnumber":"420"}},"description":"Hehehehehelmans","height":"182","weight":"105","birth_date":"1996-02-09","nationality":"Poland","credit":[ {"type":"mastercard","number":"1111111111111111","currency":"PLN","balance":"1234"} ]}
));

printjson(db.people.find( { first_name: "Bartosz", last_name: "Kowalski" } ).toArray());