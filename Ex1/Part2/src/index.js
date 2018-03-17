const express = require('express');
//var route = require('./controller/distance');
const distanceService = require('./services/distanceService.js');

const app = express();
const APP_PORT = '8080';
const APP_HOST = 'localhost';

app.set('port', APP_PORT);
app.set('host', APP_HOST);

app.get('/api/distance', function(req, res, next) {
    console.log(req.query.lat1);
    const dis = distanceService.getDistanceFromLatLonInKm(req.query.lat1, req.query.lon1, req.query.lat1, req.query.lon2);
    console.log(dis);
    res.json(dis);
});

app.listen(app.get('port'), app.get('host'), () => {
    console.log('info', `Server started at http://${app.get('host')}:${app.get('port')}`);
});

module.exports = app;
