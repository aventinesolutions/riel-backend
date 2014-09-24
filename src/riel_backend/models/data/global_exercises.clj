(ns riel-backend.models.data.global-exercises
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))


(def global-exercises
    (array-map :_id (ObjectId.)
        :exercises
        ["Abdominal Crunch Machine"
         "Abdominals"
         "Abdominals 2a"
         "Abs Forward Leg Drop"
         "Abs Side Extensions"
         "Abs Side Leg Drop"
         "Abs Top of Ball"
         "Alternating Leg Superman"
         "Alternating Pull-down Machine #8"
         "Arnold Dumbell Press"
         "Back Cable Flies"
         "Back Cable Pull"
         "Back Lunge"
         "Back Lunge with Barbell"
         "Ball Ab Crunch"
         "Ball Barbell Chest Press"
         "Ball Dumbbell Chest Press"
         "Ball Hamstring Extension"
         "Ball Roll (core)"
         "Ball Rotation"
         "Ball Twist"
         "Ball on Rope Swing"
         "Barbell Curl"
         "Bench Press"
         "Bench Press Machine (TechnoGym)"
         "Bent Over Alternating Dumbbell Row"
         "Bent Over Barbell Row"
         "Bent Over Biceps Cable Curl"
         "Bent Over Cable Flies"
         "Bent Over Dumbbell Row"
         "Bent Over Flies with Dumbbells"
         "Bent Over One Arm Dumbell Row"
         "Bent Over One Arm Dumbell Row with Bench"
         "Bent Row"
         "Bent-over Row"
         "Biceps Cable Curl"
         "Biceps Curl wi/V-Bar"
         "Biceps Dumbbell Curl"
         "Bridge on Step"
         "Buikspier programma"
         "Cable Bicep Curl"
         "Cable Chess Press"
         "Cable Extension"
         "Cable Flies"
         "Cable Flies on Exercise Ball"
         "Cable Flies on Incline Bench"
         "Cable Front Lift Palms Up"
         "Cable Hammer Curl"
         "Cable Lunge"
         "Cable Press using station 13"
         "Cable Scott Curl"
         "Calf Press using Machine #1"
         "Calf Raise on Step"
         "Central Leg Extension"
         "Chair Pull Down (C)"
         "Chest Press Incline Machine #11"
         "Chest Press Upright Machine #10"
         "Child Pose (12)"
         "Chin-up Wide Grip #24"
         "Chin-ups with Assist Machine"
         "Chip-up Reverse Grip Machine #24"
         "Close Grip Lateral Pull-down"
         "Contra Lateral High Pulley"
         "Core & Stability"
         "Cross Leg Back on Wall"
         "Cross Trainer (cardio)"
         "Crossover Back Cable Extension"
         "Crossover Fly"
         "Crossover Leg Extension ."
         "Dead Lift"
         "Decline Bench Press #29"
         "Decline Leg Press"
         "Dip"
         "Dip (Cooley)"
         "Dip Assist"
         "Dip with Machine #5"
         "Dumbbel Press 1/4 Rotation Half Incline"
         "Dumbbell Bicep Curl"
         "Dumbbell Biceps Curl with Rotation"
         "Dumbbell Chest Press (Flat)"
         "Dumbbell Front Lunge"
         "Dumbbell Front Press"
         "Dumbbell Row"
         "Dumbbell Shrug"
         "Dumbbell Side Extension"
         "Dumbbell Side Pull"
         "Dumbbell Skull Crush"
         "Dumbbell Squat"
         "Dumbbell Squat on Step"
         "Dumbell Chest Press"
         "Dumbell Chest Press on Exercise Ball"
         "Dumbell Concentration Curl"
         "Dumbell Press Half Incline with Rotation"
         "Elastic Behind Body"
         "External Rotator"
         "Forward & Backward Walking Lunges"
         "Forward Lunge wlDumbbell Wood Chop"
         "Forward Straight Arm Raise w/Dumbbells"
         "Front Press"
         "Front Raise"
         "Front Squat"
         "Grapevine Arms (Cooley)"
         "Half Incline Dumbbell Flies"
         "Half Incline Dumbbell Press"
         "Half Incline Dumbbell Press w/Rotation"
         "Half Incline Laying Skull Crunch"
         "Half Incline Skull Crunch w/Rotation"
         "Hammer Curl with Dumbbells"
         "Hanging Abs"
         "Hanging Ring"
         "Hanging Side Extenion"
         "Hexbar Squat"
         "Hip Flexor (Cooley)"
         "Hoover One Leg Up"
         "Horizontal Barbell External Rotation"
         "Horizontal Dumbbell Extension"
         "Horizontal External Rotation"
         "Horizontal Pull-up"
         "Horse Stance"
         "Hyper Extension"
         "Hyper-Extension"
         "Ice Skater"
         "Incline Ball Dumbell Press"
         "Incline Bench Dumbbell Curl"
         "Incline Bench Dumbbell Row"
         "Incline Bench Hammer Curl"
         "Incline Bench Overhead Cable Extension"
         "Incline Bench Press"
         "Incline Bench Press w/Palms Facing"
         "Incline Chest Press Machine #33"
         "Incline Dumbbell Bench Press"
         "Incline Dumbbell Curl w/Rotation"
         "Incline Dumbbell Flies"
         "Incline Dumbbell Press w/Rotation"
         "Incline Laying Dumbbell Row"
         "Incline One Arm Dumbbell Press"
         "Incline Parallell Dumbbell Press"
         "Incline Side Dumbbell Curl"
         "Incline Skull Crush"
         "Incline.Bench Dumbbell Skull Crunch"
         "Include Dumbbell Press Palms Inwards"
         "Infinity (Cooley)"
         "Internal Rotator"
         "Iso-Lateral Shoulder Press"
         "Isolateral Front Pulldown #34"
         "Isolation Curl"
         "Ketelbal Squats"
         "Kettleball Shoulder Press"
         "Kettleball Swing"
         "Ladder Drill"
         "Lat Pulldown"
         "Lat Pulldown Machine #20"
         "Lat Pulldown Machine #I8"
         "Lat Pulldown Wide Grip"
         "Lateral Bend (Cooley)"
         "Lateral Pull Down w/Neutral Grip"
         "Lateral Pulldown Reverse Grip"
         "Lateral Shouler Cable Flexor"
         "Laying Dumbbell Row"
         "Laying Extension"
         "Laying External Rotation"
         "Laying Front Raise"
         "Laying Rear Delt w/Dumbbell"
         "Laying Rear Delt w/Dumbbells"
         "Laying Scot Hammer Curl"
         "Laying Side Raise"
         "Laying Skull Crush"
         "Laying Skull Crush with V-bar"
         "Laying on Bench Dumbbell Row"
         "Leg  Curl TechnoGym machine"
         "Leg Curl Machine #2"
         "Leg Extension Machine #3"
         "Leg Extension TechnoGym machine"
         "Leg Press Machine #1"
         "Leg Press Machine #32"
         "Leg Press TechnoGym machine"
         "Lightening on the Floor"
         "Locust at Wall (15)"
         "Lotus at Wall (14)"
         "Low Pull (with cross-over cables)"
         "Low Row"
         "Lower Abdominals"
         "Lower Trapesius Pull with Rope"
         "Lunch Back w/Foot on Bench One Had Dumbbell"
         "Lunge"
         "Lunge Back Leg on Bench"
         "Lunge Backward w/Dumbbells"
         "Lunge Forward with Dumbells"
         "Lunge on Step"
         "Lying Cab"
         "Lying Cable Back Pull"
         "Lying Cable Chest Press"
         "Military Dumbbell Press"
         "Military Press"
         "Military Press with Barbell"
         "Movement Squat"
         "One Are Dumbbell Shoulder Press"
         "One Arm  High Pull #21"
         "One Arm Bent Over Cable Row"
         "One Arm Bent Over Dumbbell Row"
         "One Arm Cable Extension"
         "One Arm Cable Extensions"
         "One Arm Cable Fly"
         "One Arm Cable Lunge to Row"
         "One Arm Cable Press"
         "One Arm Cable Pull"
         "One Arm Cable Row w/Triangle"
         "One Arm Cable Shrug"
         "One Arm Chest Press"
         "One Arm Dumbbell Fly"
         "One Arm Dumbbell Press"
         "One Arm Dumbbell Row"
         "One Arm Dumbbell Shoulder Press"
         "One Arm Dumbell Shoulder Press"
         "One Arm High Cable Row"
         "One Arm High Pull w/Rotation"
         "One Arm Incline Chest Press"
         "One Arm Incline Dumbbell Press"
         "One Arm Lat Pulldown Machine #18"
         "One Arm Lateral Pulldown"
         "One Arm One Leg Side Dumbbell Raise"
         "One Arm Overhead Cable Extension"
         "One Arm Pulley with Triangle"
         "One Arm Reverse Grip Rear Delt Cable Pull"
         "One Arm Sguat to Row"
         "One Arm Shoulder Press w/Dumbell"
         "One Arm Standing Cable Row"
         "One Arm Upright Dumbbell Press"
         "One Calf Press w/Machine #3"
         "One Had Cable Trapezius Pull"
         "One Leg Back Bridge"
         "One Leg Balancing Squat"
         "One Leg Bridge"
         "One Leg Butt Extension w/2 benches"
         "One Leg Calf Raise"
         "One Leg Curl Machine #2"
         "One Leg Extension Machine #3"
         "One Leg Machine #l Press"
         "One Leg Romanian Dead Lift"
         "One Leg Sguat"
         "One Leg Side Step Up"
         "One Leg Standing Calf Raise"
         "One Leg Step Up"
         "One Leg on Step with Red Brick"
         "Overhead Ball Extension"
         "Overhead Barbell Extension"
         "Overhead Cable Triceps Extension"
         "Overhead Dumbbell Extension"
         "Overhead Rope Extension"
         "Overhead Squat with Pole"
         "Overhead V-bar Extension"
         "Polyquin Lunge"
         "Pull Down Machine #34"
         "Pull Up"
         "Pull Up Assist"
         "Pull Ups"
         "Pulldown Machine #18"
         "Pulley"
         "Pulley w/V-bar Neutral Grip"
         "Push Up"
         "Push Up On Ball"
         "Push-up with Ball on Bar"
         "Push-ups with Rings"
         "Pushup on Bar"
         "Reverse Barbell Curl"
         "Reverse Cable Curl"
         "Reverse Close Grip Lat Pulldown."
         "Reverse Grip Bentover Barbell Row"
         "Reverse Grip Cable Bar Pull"
         "Reverse Grip Cable Extension"
         "Reverse Grip Chin Up Machine #24"
         "Reverse Grip Low Row"
         "Reverse Grip Pulldown"
         "Reverse Grip Rear Delt Cable Pull"
         "Reverse Grip Skull Crush w/Barbell"
         "Reverse Lunge"
         "Reverse Polyquin Lunges"
         "Reverse Skull Crush with V-bar"
         "Reverse Tricep Extension"
         "Ring Horizontal Pull-up"
         "Romanian Dead Lift"
         "Romanian Dead Lift w/Dumbbells"
         "Rope Crunch"
         "Rope Jumping (cardio)"
         "Rope Pull"
         "Rope Tricep Extension"
         "Rotary Calf Machine"
         "Rotary Calf TechnoGym machine"
         "Rowing (cardio)"
         "Rowing Floor Bridge with Dumbbells"
         "Rowing Machine"
         "Sawing"
         "Scott Curl w/V-Bar"
         "Seated Pulley w/Rope"
         "Seated Pulley w/Triangle"
         "Shoulder Depression"
         "Shoulder Press Machine #31"
         "Shoulder Press with Barbell"
         "Shoulder Press with Dumbbells"
         "Shoulder Push-up"
         "Shrugs with Dumbbell"
         "Side Abs Extension on Swiss Ball"
         "Side Arm Cable Extension"
         "Side Bridge"
         "Side Crunch on Ball"
         "Side Dumbbell Raise"
         "Side Dumbbell Raise 70 Degrees"
         "Side Hanging Extension"
         "Single Arm Cable Row"
         "Sitthing Front Press with Dumbbells"
         "Sitting Bentover Dumbbell Flies"
         "Sitting Bicep Cable Curls"
         "Sitting Cable Curl"
         "Sitting Calf Raise"
         "Sitting Dumbbell Press"
         "Sitting Side Raise with Dumbbells"
         "Sitting V-Bar Curl"
         "Skull Crush w/Dumbbells"
         "Snow boarding"
         "Split Squat on Step"
         "Squat"
         "Squat Jumps"
         "Squat Yahoooo"
         "Squat on Core Board"
         "Squat to Row"
         "Squat using Dumbell"
         "Squats with Bounce at Bottom"
         "Stair Master (cardio)"
         "Standing Bent Over Cable Curl"
         "Standing Bentover Kickback"
         "Standing Cable Flies"
         "Standing Cable Row w/Rotation"
         "Standing Calf Raise"
         "Standing Calf Raise on Step with Dumbbells"
         "Standing Dumbbell Military Press"
         "Standing Hammer Curl"
         "Standing Row"
         "Standing Straight Cable Flies"
         "Static Lunges with Dumbbells"
         "Stationary Bike (Cardio)"
         "Step Up"
         "Step Up on 2.5 Step"
         "Straight Arm Lat Pulldown"
         "Straight Bar Curl"
         "Strengt"
         "Strength Training"
         "Stretching"
         "Thigh Stretch at Wall (cooleo}"
         "Treadmill"
         "Triangle Pull-Down"
         "Triceps Cable Extension"
         "Triceps Cable Extension with Rope"
         "Triceps Pushdown"
         "Upright Row w/V-Bar"
         "V-Bar Cable Curl"
         "Very Deep Squats"
         "Walking Lunge One Leg at a Time"
         "Walking Lunge with Barbell"
         "Walking Lunge with Dumbbell"
         "Walking Lunge with Swing"
         "Wall Roll-Down (16)"
         "Wide Grip Barbell Row"
         "Wide Grip Bench Press"
         "Wide Leg Forward Bend (c)"
         "Wood Chop w/Cable"
         "Zieg Heil"]))

(defn insert-global-exercises [db]
  (mc/insert-and-return db "global" global-exercises))

(defn delete-global-exercises [db]
  (map (fn [oid] (mc/remove db "global" { :_id oid }))
       (map (fn [doc] (if (get doc :exercises)
                       (get doc :_id))) (mc/find-maps db "global"))))

(defn get-global-exercises [db]
  (last (map (fn [doc] (if (get doc :exercises)
                     (get doc :exercises))) (mc/find-maps db "global"))))