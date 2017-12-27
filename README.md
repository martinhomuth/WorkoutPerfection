WorkoutPerfection is an app for tracking your workout results and
based on that suggest a workout routine.

HINT: This is highly work in progress and literally everything will
change

* Workout suggestion

  The workout is based on several preferences:
  - workout days per week (3 to 6 days)
  - expert setting to target niche muscles rather than the typical
    larger muscle groups
  - rotation duration - e.g. 3 days for the full body or up to 6
  - workout style - push/pull/legs or parts
  - used techniques [[https://www.bodybuilding.com/fun/reading_workout_logs.htm#8][bb.com]]
    - supersets
    - dropsets
    - giant sets
    - failure
    - etc
    - TODO: add extensive explanation in the app
  - periodization
    - hypertrophy (8-12 reps, <60s rest)
    - heavy lifting (6-8 reps, >3min rest)
    - hypertrophy with supersets and dropsets (8-12 reps)
    - occlusion training (15-30 reps, <30s rest)
  - total number of sets per workout

  One of the major features is the use of the website
  http://www.exrx.net/Lists/Directory.html where various exercises and
  muscle descriptions are listed.

  It is necessary to use the Brzychi formula to identify the maximum
  load. This calculation session is included in the workout once per
  month to adjust the internal values and optimize the workout values
  from there on. See https://en.wikipedia.org/wiki/One-repetition_maximum

* Tracking (during workout)

  For a workout app to work properly there are several things to
  consider:
  1. One does not want to enter more than a single number per set
     (weight or reps)
  2. Based on preferences the appropriate rest period is started after
     entering/acking the reps
  3. vibration/bell after rest period

* Automatic Adjustment

  This is the key feature of the app that removes the need for
  manually thinking of a new workout every other month or so. The key
  lies in the separation of body parts and probabilities of exercises
  to be selected in the next workout session of that body part.

  An example:
  On a leg day you perform hypertrophy training with squats. The next
  leg workout session will almost surely not contain squats and the
  one after that has at least a higher chance of being selected. The
  adjustments are based on various factors: compound movements vs
  isolation movements, hit target reps, number of specific muscles to
  hit (expert mode)
