<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="/fullcalendar/lib/main.css" rel="stylesheet"/>
    <link href="/fullcalendar/lib/main.min.css" rel="stylesheet"/>
    <script src="/fullcalendar/lib/locales-all.js"></script>
    <script src="/fullcalendar/lib/locales-all.min.js"></script>
    <script src="/fullcalendar/lib/main.js"></script>
    <script src="/fullcalendar/lib/main.min.js"></script>
    <script>

        document.addEventListener('DOMContentLoaded', function() {
            var calendarEl = document.getElementById('calendar');
            var calendar = new FullCalendar.Calendar(calendarEl, {
                height: '100%',
                expandRows: true,
                slotMinTime: '08:00',
                slotMaxTime: '20:00',
                headerToolbar: {
                    left: 'prev,next',
                    center: 'title',
                    right: 'dayGridMonth,listWeek'
                },
                initialView: 'dayGridMonth',
                initialDate: '2020-09-12',
                navLinks: true, // can click day/week names to navigate views 상세로 넘어감
                editable: true,
                selectable: true,
                nowIndicator: true, // 뭐임?
                dayMaxEvents: true, // allow "more" link when too many events // 크기 제한
                // 일정 추가

                events: [

                    {
                        title: 'empty',
                        start: '2020-09-01',
                    },
                    {
                        title: 'Long Event',
                        start: '2020-09-07',
                        end: '2020-09-10'
                    },
                    {
                        groupId: 999,
                        title: 'Repeating Event',
                        start: '2020-09-09T16:00:00'
                    },
                    {
                        groupId: 999,
                        title: 'Repeating Event',
                        start: '2020-09-16T16:00:00'
                    },
                    {
                        title: 'Conference',
                        start: '2020-09-11',
                        end: '2020-09-13'
                    },
                    {
                        title: 'Meeting',
                        start: '2020-09-12T10:30:00',
                        end: '2020-09-12T12:30:00'
                    },
                    {
                        title: 'Lunch',
                        start: '2020-09-12T12:00:00'
                    },
                    {
                        title: 'Meeting',
                        start: '2020-09-12T14:30:00'
                    },
                    {
                        title: 'Happy Hour',
                        start: '2020-09-12T17:30:00'
                    },
                    {
                        title: 'Dinner',
                        start: '2020-09-12T20:00:00'
                    },
                    {
                        title: 'Birthday Party',
                        start: '2020-09-13T07:00:00'
                    },
                    {
                        title: 'Click for Google',
                        url: 'http://google.com/',
                        start: '2020-09-28'
                    }
                ]
            });

            calendar.render();
        });

    </script>
    <style>

        html, body {
            overflow: hidden; /* don't do scrollbars */
            font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
            font-size: 14px;
        }

        #calendar-container {
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
        }

        .fc-header-toolbar {
            /*
            the calendar will be butting up against the edges,
            but let's scoot in the header's buttons
            */
            padding-top: 1em;
            padding-left: 1em;
            padding-right: 1em;
        }

    </style>
</head>
<body>

<div id='calendar-container'>
    <div id='calendar'>gjdbwls</div>
</div>

</body>
</html>
</html>