//commandlines are included for references in between
const express = require('express');
const {
    updateWindow,
    getWindow,
    calculateAverage
} = require('./windowManager');
// to use local port
const app = express();
const port = 9876;

app.use(express.json()); // to parse JSON request body

// Default route for root access with JSON
app.get('/', (req, res) => {
    res.send('Use numbers with JSON body: { "numbers": [1, 2, 3] }');
});

// to accept user numbers as input data
app.post('/numbers', (req, res) => {
    const newNumbers = req.body.numbers;
//in case of errors if any
    if (!Array.isArray(newNumbers)) {
        return res.status(400).json({ error: 'Please provide a proper array of numbers in the "numbers" field.' });
    }
//performing required operations
    const prevWindow = [...getWindow()];
    const currWindow = updateWindow(newNumbers);
    const avg = calculateAverage(currWindow);
//printing the requirements as per the question
    res.json({
        numbers: newNumbers,
        windowPrevState: prevWindow,
        windowCurrState: currWindow,
        avg
    });
});
// running the program at local host
app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});
