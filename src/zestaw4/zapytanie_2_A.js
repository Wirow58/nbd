printjson(
    db.people.aggregate([
        {
            $unwind: "$credit"
        },
        {
            $group: {
                _id: "$credit.currency",
                "Bilans na karcie": { $sum: { $toDouble: "$credit.balance" } }
            }
        },
        {
            $project: {
                _id: 0,
                waluta: "$_id",
                "Bilans na karcie": 1
            }
        }
    ])
    .toArray()
);