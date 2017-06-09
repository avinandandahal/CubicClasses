exports.Grade = function(score) {
    if (score >= 90) {
        return 'A';
    }
    if (score >= 80 && score < 90) {
        return 'B';
    }
    if (score >= 70 && score < 80) {
        return 'C';
    }
    if (score >= 60 && score < 70) {
        return 'D';
    }
    else {
        return 'F';
    }
};