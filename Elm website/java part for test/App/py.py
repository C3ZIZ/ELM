# Read the input file and remove empty lines
with open('Elm courses.txt', 'r', encoding='utf-8') as file:
    content = file.readlines()
    content = [line.strip() for line in content if line.strip()]

# Extract course names and remove duplicates
course_names = set()
for line in content:
    courses = line.split(', ')
    for course in courses:
        course_names.add(course.strip())

# Write the result to a new file
with open('resCourse.txt', 'w', encoding='utf-8') as file:
    for course in course_names:
        file.write(course + '\n')