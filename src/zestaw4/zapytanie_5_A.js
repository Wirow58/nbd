printjson(
    db.people.aggregate([
        {
            $match: { sex: "Female", nationality: "Poland" }
        },
        {
            $unwind: {path: "$credit"}
        },
        {
            $group: {
                _id: "$credit.currency",
                "Average balance": { $avg: "$credit.balance" },
                "Total balance": { $sum: "$credit.balance" }
            }
        }
    ])
    .toArray()
);