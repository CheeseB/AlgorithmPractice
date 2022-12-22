function solution(food) {
  let left = '';
  let right = '';
  food.forEach((value, idx) => {
    if (idx !== 0) {
      for (let i = 0; i < parseInt(value / 2); i++) {
        left += idx;
        right = idx + right;
      }
    }
  });
  return `${left}0${right}`;
}
