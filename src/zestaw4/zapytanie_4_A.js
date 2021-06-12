printjson(
    db.people.aggregate([
        {
            $group: {
                _id: "$nationality",
                "Minimalne BMI": {
                    "$min": {
                        $divide: [
                            { $toDouble: "$weight" },
                            { $pow: [ { $divide: [{ $toDouble: "$height" }, 100] }, 2 ] }
                        ]
                    }
                },
                "Maksymalne BMI": {
                    "$max": {
                        $divide: [
                            { $toDouble: "$weight" },
                            { $pow: [ { $divide: [{ $toDouble: "$height" }, 100] }, 2 ] }
                        ]
                    }
                },
                "Średnie BMI": {
                    "$avg": {
                        $divide: [
                            { $toDouble: "$weight" },
                            { $pow: [ { $divide: [{ $toDouble: "$height" }, 100] }, 2 ] }
                        ]
                    }
                }
            }
        },
		{
			$sort: { _id: 1 }
		}
    ])
    .toArray()
);