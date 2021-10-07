import 'package:flutter/material.dart'; // or import package:flutter/foundation.dart - For the @required

class Transaction {
  final String id; // Each transaction should have an ID
  final String title;
  final double amount;
  final DateTime date; // To hold Date & Time

  Transaction(
      {@required this.id,
      @required this.title,
      @required this.amount,
      @required this.date});
}
